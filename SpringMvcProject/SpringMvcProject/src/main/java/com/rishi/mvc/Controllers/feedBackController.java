package com.rishi.mvc.Controllers;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class feedBackController {

    //@RequestMapping(value = "/feedbacks",method = RequestMethod.GET) // this is old way Annotation easy way
    @GetMapping("/feedbacks")
    public List<String> getFeedbacks(){
        List<String> feedbacks  = Arrays.asList(
                "Good course java",
                "Rishi singh Join this course",
                "My teacher durgesh sir",
                "valuable thing"
        );
        return feedbacks;
    }
    @PostMapping("/create-feedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "Created feedback";
    }
    /*
    @PutMapping
    @Deleting Mapping
    @patchMapping
    */

}
