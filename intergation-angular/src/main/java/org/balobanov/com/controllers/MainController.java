package org.balobanov.com.controllers;

import org.balobanov.com.mocks.MockUtils;
import org.balobanov.com.models.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MainController {

    @Autowired
    MockUtils mockUtils;

    @ResponseBody
    @RequestMapping(value = "/test-model-array", produces = "application/json", method = RequestMethod.GET)
    public List<TestModel> home() {
        List<TestModel> testModelList = mockUtils.getTestModelList();
        return testModelList;
    }
}
