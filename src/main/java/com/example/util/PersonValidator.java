// package com.example.util;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
// import org.springframework.validation.Errors;
// import org.springframework.validation.Validator;

// import com.example.dao.PersonDAO;
// import com.example.models.Person;

// @Component
// public class PersonValidator implements Validator{

//     private final PersonDAO personDAO;

//     @Autowired
//     public PersonValidator(PersonDAO personDAO) {
//         this.personDAO = personDAO;
//     }

//     @Override
//     public boolean supports(@SuppressWarnings("null") Class<?> clazz) {
//         return Person.class.equals(clazz);
        
//     }

//     @Override
//     public void validate(@SuppressWarnings("null") Object o, @SuppressWarnings("null") Errors errors) {
//        Person person = (Person) o;

    //    if(personDAO.show(person.getEmail()).isPresent()) {
    //     errors.rejectValue("email", "", "This email is alredy exist");
    //    }

       // See if there is a person with the same email in the database

//     }
    
// }
