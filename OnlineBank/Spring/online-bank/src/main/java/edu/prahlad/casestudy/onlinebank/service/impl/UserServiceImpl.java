package edu.prahlad.casestudy.onlinebank.service.impl;

import edu.prahlad.casestudy.onlinebank.constants.ErrorCodes;
import edu.prahlad.casestudy.onlinebank.entity.Users;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.repo.UsersRepo;
import edu.prahlad.casestudy.onlinebank.service.AccountService;
import edu.prahlad.casestudy.onlinebank.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private AccountService accountService;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;


    @Override
    public void save(Users users)throws CaseStudyException  {
        usersRepo.save(users);
    }

    @Override
    public Users createUser(Users users) throws CaseStudyException {
        Users localUser = usersRepo.findByUserName(users.getUserName());

        if(localUser != null){
            logger.warn("User with username {} already exists. Nothing will be done. ", users.getUserName());
            throw new CaseStudyException(ErrorCodes.E_USER_ALREADY_EXISTS, "");
        }else {
            String password = users.getPassword();

            users.setPrimaryAccount(accountService.createPrimaryAccount());
            users.setSavingsAccount(accountService.createSavingsAccount());

            localUser = usersRepo.save(users);
        }

        return localUser;
    }


    @Override
    public Users findByUsername(String username) throws CaseStudyException {
        return usersRepo.findByUserName(username);
    }

    @Override
    public Users findByEmail(String email) throws CaseStudyException {
        return usersRepo.findByEmail(email);
    }

    @Override
    public boolean checkUserExists(String username, String email) throws CaseStudyException {
        if(checkUsernameExists(username) || checkEmailExists(email))
            return true;

        return false;
    }

    @Override
    public boolean checkUsernameExists(String username) throws CaseStudyException {
        if(null != findByUsername(username))
            return true;

        return false;
    }

    @Override
    public boolean checkEmailExists(String email) throws CaseStudyException {
        if(null != findByEmail(email))
            return true;

        return false;
    }


    @Override
    public Users validateUser(Users users) throws CaseStudyException {
        Users localUser = findByUsername(users.getUserName());
        if(null == localUser)
            throw new CaseStudyException(ErrorCodes.E_NO_USER_EXISTS, "");

        return localUser;
    }

    @Override
    public Users saveUser(Users users) throws CaseStudyException {
        return usersRepo.save(users);
    }

    @Override
    public List<Users> getUserList() throws CaseStudyException {
        return usersRepo.findAll();
    }

    @Override
    public void enableUser(String username) throws CaseStudyException {
        Users users = findByUsername(username);
        users.setEnabled(true);
        usersRepo.save(users);
    }

    @Override
    public void disableUser(String username) throws CaseStudyException {
        logger.info("disableUser Call");
        Users users = findByUsername(username);
        users.setEnabled(false);
        usersRepo.save(users);
    }
}
