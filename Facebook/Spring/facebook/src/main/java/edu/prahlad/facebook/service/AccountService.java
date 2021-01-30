package edu.prahlad.facebook.service;

import edu.prahlad.facebook.constants.FacebookException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class AccountService {
    Logger log = LoggerFactory.getLogger(AccountService.class);

    public boolean resetPassword(){
        log.error("resetPassword for the account: {}");
        return true;
    }

}
