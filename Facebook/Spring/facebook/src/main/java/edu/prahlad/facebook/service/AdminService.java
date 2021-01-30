package edu.prahlad.facebook.service;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.entity.actions.Message;
import edu.prahlad.facebook.entity.actions.Page;
import edu.prahlad.facebook.entity.base.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class AdminService {
    Logger log = LoggerFactory.getLogger(AdminService.class);

    public boolean blockUser(Member customer){
        log.error("blockUser request for customer: {}", customer);
        return true;
    }

    public boolean unblockUser(Member customer){
        log.error("unblockUser request for customer: {}", customer);
        return true;
    }

    public boolean enablePage(Page page){
        log.error("enablePage request for page: {}", page);
        return true;
    }

    public boolean disablePage(Page page){
        log.error("disablePage request for page: {}", page);
        return true;
    }
}
