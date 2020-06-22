package edu.prahlad.casestudy.onlinebank.service;

import edu.prahlad.casestudy.onlinebank.entity.Users;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;

import java.util.List;

public interface UserService {
    Users findByUsername(String username) throws CaseStudyException;
    Users findByEmail(String email) throws CaseStudyException;

    boolean checkUserExists(String username, String email) throws CaseStudyException;
    boolean checkUsernameExists(String username) throws CaseStudyException;
    boolean checkEmailExists(String email) throws CaseStudyException;

    void save(Users users) throws CaseStudyException;
    Users createUser(Users users) throws CaseStudyException;
    Users saveUser(Users users) throws CaseStudyException;
    List<Users> getUserList() throws CaseStudyException;

    Users validateUser(Users users) throws CaseStudyException;

    void enableUser(String username) throws CaseStudyException;
    void disableUser(String username) throws CaseStudyException;

}
