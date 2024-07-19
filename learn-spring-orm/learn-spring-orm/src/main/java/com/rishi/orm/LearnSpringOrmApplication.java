package com.rishi.orm;

import com.rishi.orm.entities.*;
import com.rishi.orm.repositories.CategoryRepo;
import com.rishi.orm.repositories.ProductRepo;
import com.rishi.orm.repositories.StudentRepository;
import com.rishi.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

//	Logger logger = LoggerFactory.getLogger(StudentRepository.class);
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private UserService userService;

	Logger logger =  LoggerFactory.getLogger(LearnSpringOrmApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Rishi singh");
//		user.setCity("Basti");
//		user.setAge(22);
//		User saveUser = userService.saveUser(user);
//		userService.saveUser(saveUser);

		//get All user
//		List<User> allUser = userService.getAllUser();
//		logger.info("user size is {} ", allUser.size());
//		logger.info("user is {} ", allUser);

		//get Single user
//		User user = userService.getUser(1);
//		logger.info("user is {}", user);

		// if we give that not exist id
//		User user = userService.getUser(30);
//		logger.info("user is {}", user);

		//Method Update
//		User user  = new User();
//		user.setName("Golu Singh");
//		user.setAge(25);
//		user.setCity("Delhi");
//		User updateUser = userService.updateUser(user, 3);
//		logger.info("updated user details : {}",updateUser);

		//user Deleted
		//userService.deleteUser(3);

	/*	Student student = new Student();
		student.setStudentName("Mohit singh");
		student.setAbout("I am Test engineer");
		student.setStudentId(13);

		Laptop laptop = new Laptop();
		laptop.setModelNumber("2324");
		laptop.setBrand("HP");
		laptop.setLaptopId(123);

		//important
		laptop.setStudent(student);
		student.setLaptop(laptop);

		// 2 Way to Save laptop frogin key save
		//1 manually save
		// cascade ke throw in Student OneToOne @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
		Student save = studentRepository.save(student);
		logger.info("Saved student : {}",save.getStudentName());*/

		//OnetoOne
//		Student student = studentRepository.findById(13).get();
//		logger.info("Name is {}",student.getStudentName());
//
//		Laptop laptop = student.getLaptop();
//		logger.info("Laptop {},{}",laptop.getBrand(),laptop.getModelNumber());

		//OnetoMany and ManytoOne
	/*	Student student = new Student();
		student.setStudentName("Nitin singh");
		student.setAbout("I am Test engineer");
		student.setStudentId(15);

		Address a1 = new Address();
		a1.setAddressId(131);
		a1.setStreet("235/432");
		a1.setCity("Basti");
		a1.setCountry("India");
		a1.setStudent(student);

		Address a2 = new Address();
		a2.setAddressId(133);
		a2.setStreet("453/234");
		a2.setCity("Indore");
		a2.setCountry("India");
		a2.setStudent(student);

		List<Address> addressList = new ArrayList<>();
		addressList.add(a1);
		addressList.add(a2);

		student.setAddressesList(addressList);
		Student save = studentRepository.save(student);
		logger.info("Student created : with address ");*/

		//ManytoMany
		/*Product product1  = new Product();
		product1.setpId("pid1");
		product1.setProductName("Iphone 14 max");

		Product product2  = new Product();
		product2.setpId("pid2");
		product2.setProductName("Realmi U1");

		Product product3  = new Product();
		product3.setpId("pid3");
		product3.setProductName("OnePlus TV");

		Category category1 = new Category();
		category1.setcId("cid1");
		category1.setTitle("Electronics");

		Category category2  = new Category();
		category2.setTitle("Mobile phone");
		category2.setcId("cid2");

		List<Product> category1Products = category1.getProducts();
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);

		List<Product> category2Products = category2.getProducts();
		category2Products.add(product1);
		category2Products.add(product2);

		categoryRepo.save(category1);
		categoryRepo.save(category2);*/

		/*// Fetch
		Category category = categoryRepo.findById("cid1").get();
//		System.out.println(category.getProducts().size());

		Category category2 = categoryRepo.findById("cid2").get();
//		System.out.println(category2.getProducts().size());

		Product product = productRepo.findById("pid1").get();
		System.out.println(product.getCategories().size());*/

		Optional<Product> byProductName = productRepo.findByProductName("Iphone 14 max");
//		System.out.println(byProductName.isPresent());
//		System.out.println(byProductName.get().getProductName());
//
//		System.out.println("++++++++++++++++++++++++++++++++++++++++");
//		List<Product> U1 = productRepo.findByProductNameEndingWith("U1");
//		U1.forEach(product -> {
//			System.out.println(product.getProductName());
//		});
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//		List<Product> plus = productRepo.findByProductNameContaining("plus");
//		plus.forEach(product -> {
//			System.out.println(product.getProductName());
//		});
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
//		List<Product> realmi = productRepo.findByProductNameIn(Arrays.asList("Iphone 14 max", "Realmi U1"));
//		realmi.forEach(product -> {
//			System.out.println(product.getProductName());
//		});
		List<Product> getProductsWhileLear = productRepo.getAllProductWhileLearningJPA();
		getProductsWhileLear.forEach(product -> {
			System.out.println(product.getProductName());
		});

		productRepo.getAllActiveProducts().forEach(product -> System.out.println(product.getProductName()));
	}
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductRepo productRepo;
}
