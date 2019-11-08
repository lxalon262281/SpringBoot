package com.lx.jpaTest.batch.config;

import com.lx.jpaTest.entity.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.lang.Nullable;

public class CsvProcessor extends ValidatingItemProcessor<Person> {

    @Nullable
    @Override
    public Person process(Person person) throws ValidationException {
        //执行这行代码才会调用自定义的校验器
        super.process(person);

        if (person.getNation().equals("汉族")) {
            person.setNation("01");
        } else {
            person.setNation("02");
        }

        return person;
    }
}
