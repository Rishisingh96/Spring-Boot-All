//package com.rishi.mvc.Controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//// This class is marked as a Controller
////@Controller
//// This class is also annotated as a RestController, which implies that all handler methods return data that will be written directly to the HTTP response body
//@RestController   //we use @RestController = Controller + ResponseBody than no use controller and ResponseBody
//// This annotation specifies the base URL for all request mappings in this class
//@RequestMapping
//public class ApiController {
//
//    // This method handles GET requests to /hello endpoint
//    @RequestMapping("/hello")
//    // This annotation indicates that the return value of this method should be written directly to the HTTP response body
//    //@ResponseBody     //return value in Browser   // Note need when we use @RestController = Controller + ResponseBody
//    public String helloApi(){
//        return "Hello Rishi How are you?";
//    }
//
//    // This method handles GET requests to /users endpoint
//    @RequestMapping("/users")
//    // This annotation indicates that the return value of this method should be written directly to the HTTP response body
//    //@ResponseBody
//    public List<String> getUserData(){
//        return Arrays.asList("Ram", "Rishi","Durgesh sir");
//    }
//}
//
//
//// @RequestBody alternative @RestController
//
///*Certainly! Let's explore each annotation and its usage in detail:
//
//1. `@RestController`:
//   - **Definition**: `@RestController` is a convenience annotation in Spring that combines `@Controller` and `@ResponseBody`. It is used to define RESTful web services that directly return JSON, XML, or any other data representation instead of rendering a model.
//   - **Example**:
//
//     ```java
//     import org.springframework.web.bind.annotation.GetMapping;
//     import org.springframework.web.bind.annotation.RestController;
//     import java.util.Arrays;
//     import java.util.List;
//
//     @RestController
//     public class ExampleController {
//
//         @GetMapping("/example")
//         public List<String> getExampleData() {
//             return Arrays.asList("Data1", "Data2", "Data3");
//         }
//     }
//     ```
//
//2. `@ResponseBody`:
//   - **Definition**: `@ResponseBody` is an annotation used to indicate that the return value of a method should be directly written to the HTTP response body. It is typically used in conjunction with `@Controller` methods to return data instead of a view.
//   - **Example**:
//
//     ```java
//     import org.springframework.web.bind.annotation.GetMapping;
//     import org.springframework.web.bind.annotation.ResponseBody;
//     import org.springframework.stereotype.Controller;
//
//     @Controller
//     public class ExampleController {
//
//         @GetMapping("/example")
//         @ResponseBody
//         public String getExampleData() {
//             return "This is example data";
//         }
//     }
//     ```
//
//3. `@RequestMapping`:
//   - **Definition**: `@RequestMapping` is used to map HTTP requests to handler methods of MVC and REST controllers. It can be applied at the class or method level and allows customization of HTTP methods, headers, parameters, and more.
//   - **Example**:
//
//     ```java
//     import org.springframework.web.bind.annotation.GetMapping;
//     import org.springframework.web.bind.annotation.RequestMapping;
//     import org.springframework.web.bind.annotation.RestController;
//     import java.util.Arrays;
//     import java.util.List;
//
//     @RestController
//     @RequestMapping("/api")
//     public class ExampleController {
//
//         @GetMapping("/example")
//         public List<String> getExampleData() {
//             return Arrays.asList("Data1", "Data2", "Data3");
//         }
//     }
//     ```
//
//4. `@Controller`:
//   - **Definition**: `@Controller` is a Spring annotation used to define controller classes in Spring MVC applications. It marks a class as a Spring MVC controller, capable of handling HTTP requests and returning views.
//   - **Example**:
//
//     ```java
//     import org.springframework.stereotype.Controller;
//     import org.springframework.web.bind.annotation.GetMapping;
//
//     @Controller
//     public class ExampleController {
//
//         @GetMapping("/example")
//         public String examplePage() {
//             return "example"; // Returns the name of the view/template
//         }
//     }
//     ```
//
//These annotations are fundamental building blocks in Spring MVC and Spring Boot applications, allowing you to create robust and scalable web services and applications.
//*/