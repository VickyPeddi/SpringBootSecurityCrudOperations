package com.example.nanda.controller;

//@RestController
//@RequestMapping("/base")
public class Homecontroller {
//	@Autowired
//	public MyUserservice userservice;
//	@Autowired
//	Jwtutil jwtutil;
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@RequestMapping("/")
//	public ResponseEntity<?> getallusers() {
//		return ResponseEntity.status(HttpStatus.OK).body(userservice.getallUsers());
//	}
//
//	@RequestMapping("/user/{id}")
//	public ResponseEntity<?> getoneUser(@PathVariable("id") int id) {
//		return ResponseEntity.status(HttpStatus.OK).body(userservice.getoneUser(id));
//	}
//
//	@PostMapping("/create")
//	public ResponseEntity<?> saveUser(@RequestBody User user) {
//		return ResponseEntity.status(HttpStatus.OK).body(userservice.createuser(user));
//	}
//
//	@RequestMapping("/delete/{id}")
//	public ResponseEntity<?> deleteuser(@PathVariable int id) {
//		userservice.deleteuser(id);
//		return ResponseEntity.status(HttpStatus.GONE).body("user is deleted by id " + id);
//	}

//    @PostMapping("/generatetoken")
//    public String generateToken(@RequestBody Jwtrequest authrequest) throws Exception {
//        System.out.println("befor" + authrequest.getUsername());
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authrequest.getUsername(), authrequest.getPassword()));
//        } catch (Exception e) {
//            throw new Exception("Invalid username and password");
//        }
//        User userdetails = userservice.getuserbyUsername(authrequest.getUsername());
//        String token = jwtutil.generateToken(userdetails.getUsername());
//        System.out.println("Username is " + authrequest.getUsername() + "token is " + token);
//        return token;
//    }
}
