package edu.prahlad.facebook.service.member;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.model.ProfileModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class ProfileService {

    Logger log = LoggerFactory.getLogger(ProfileService.class);

    public boolean addWorkExperience(ProfileModel profileModel){
        log.error("addWorkExperience request for profileModel: {}", profileModel);
        return true;
    }
}
