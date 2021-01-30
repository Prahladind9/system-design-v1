package edu.prahlad.facebook.service.member;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.entity.actions.Message;
import edu.prahlad.facebook.entity.actions.Post;
import edu.prahlad.facebook.entity.base.ConnectionInvitation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static java.util.Collections.reverseOrder;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class MemberService {
    Logger log = LoggerFactory.getLogger(MemberService.class);

    public boolean sendMessage(Message message){
        log.error("sendMessage request with message: {}", message);
        return true;
    }

    public boolean createPost(Post post){
        log.error("createPost request with post: {}", post);
        return true;
    }

    public boolean sendConnectionInvitation(ConnectionInvitation invitation){
        log.error("sendConnectionInvitation request with invitation: {}", invitation);
        return true;
    }

    public boolean acceptConnection(ConnectionInvitation invitation){
        log.error("acceptConnection request with invitation: {}", invitation);
        return true;
    }

    public boolean rejectConnection(ConnectionInvitation invitation){
        log.error("rejectConnection request with invitation: {}", invitation);
        return true;
    }


}
