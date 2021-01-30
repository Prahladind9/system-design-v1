package edu.prahlad.facebook.service.member;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.entity.actions.Group;
import edu.prahlad.facebook.entity.actions.Page;
import edu.prahlad.facebook.entity.actions.Recommendation;
import edu.prahlad.facebook.entity.base.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class GroupService {
    Logger log = LoggerFactory.getLogger(GroupService.class);

    public boolean addMember(Member member){
        log.error("addMember request for member: {}", member);
        return true;
    }

    public boolean updateDescription(Group group){
        log.error("updateDescription request for group: {}", group);
        return true;
    }
}
