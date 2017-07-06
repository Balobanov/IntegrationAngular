package org.balobanov.com.mocks;

import org.balobanov.com.models.TestModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockUtils {

    public List<TestModel> getTestModelList(){
        List<TestModel> list = new ArrayList<>();
        for(int i=0; i <10; i++) {
            TestModel testModel = new TestModel();
            testModel.setName("Name " + i);
            list.add(testModel);
        }
        return list;
    }
}
