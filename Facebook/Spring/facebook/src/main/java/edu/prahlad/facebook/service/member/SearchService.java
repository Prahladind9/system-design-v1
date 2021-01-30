package edu.prahlad.facebook.service.member;

import edu.prahlad.facebook.constants.FacebookException;
import edu.prahlad.facebook.entity.actions.Group;
import edu.prahlad.facebook.entity.actions.Page;
import edu.prahlad.facebook.entity.actions.Post;
import edu.prahlad.facebook.entity.base.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional(rollbackOn = {FacebookException.class})
public class SearchService implements Search {

    /**
     * Advance > Create SearchIndex to store data in cache, reducing no. of db calls
     */

    Logger log = LoggerFactory.getLogger(SearchService.class);

    @Override
    public List<Member> searchMember(String name) {
        log.error("searchMember request for name: {}", name);
        return null;
    }

    @Override
    public List<Group> searchGroup(String name) {
        log.error("searchGroup request for name: {}", name);
        return null;
    }

    @Override
    public List<Page> searchPage(String name) {
        log.error("searchPage request for name: {}", name);
        return null;
    }

    @Override
    public List<Post> searchPost(String word) {
        log.error("searchMember request for word like: {}", word);
        return null;
    }
}

interface Search {
    public List<Member> searchMember(String name);
    public List<Group> searchGroup(String name);
    public List<Page> searchPage(String name);
    public List<Post> searchPost(String word);
}