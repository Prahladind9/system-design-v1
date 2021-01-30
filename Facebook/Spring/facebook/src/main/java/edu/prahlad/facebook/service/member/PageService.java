package edu.prahlad.facebook.service.member;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.entity.actions.Page;
import edu.prahlad.facebook.entity.actions.Recommendation;
import edu.prahlad.facebook.model.ProfileModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class PageService {

    Logger log = LoggerFactory.getLogger(PageService.class);

    public List<Recommendation> getRecommendation(Page page){
        log.error("getRecommendation request for page: {}", page);
        return null;
    }
}
