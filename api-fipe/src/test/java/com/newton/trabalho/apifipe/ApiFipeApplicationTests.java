package com.newton.trabalho.apifipe;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractIterableAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.annotation.Annotation;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class ApiFipeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain() {
		ApiFipeApplication.main(new String[]{});
	}

	@Test
	void testId() {
		Id id = new Id() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return null;
			}
		};
	}

	@Nested
	@DataMongoTest
	class MongoDbSpringIntegrationTest {

		@Autowired
		private MongoTemplate mongoTemplate;

		@Test
		@DisplayName("given object to save, when save object using MongoDB template, then object is saved")
		public void testSaveObject() {
			// given
			DBObject objectToSave = BasicDBObjectBuilder.start()
					.add("key", "value")
					.get();

			// when
			mongoTemplate.save(objectToSave, "collection");

			// then
			assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key")
					.containsOnly("value");
		}
	}

	private <ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, Object>, SELF extends AbstractIterableAssert<SELF, Iterable<? extends ELEMENT>, Object, ELEMENT_ASSERT>> AbstractIterableAssert<SELF, Iterable<? extends ELEMENT>, Object,ELEMENT_ASSERT> assertThat(List<DBObject> collection)
	{
		return null;
	}

}
