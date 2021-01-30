package edu.prahlad.facebook.controller;

import edu.prahlad.facebook.entity.actions.*;
import edu.prahlad.facebook.entity.base.ConnectionInvitation;
import edu.prahlad.facebook.entity.base.Member;
import edu.prahlad.facebook.model.ProfileModel;
import edu.prahlad.facebook.service.member.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("member")
public class MemberController {
    Logger log = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;
    @Autowired
    private ProfileService profileService;
    @Autowired
    private GroupService groupService;
    @Autowired
    private PageService pageService;
    @Autowired
    private SearchService searchService;

    @PostMapping("sendMessage")
    public boolean sendMessage(@RequestBody Message message){
        return this.memberService.sendMessage(message);
    }

    @PostMapping("createPost")
    public boolean createPost(@RequestBody Post post){
        return this.memberService.createPost(post);
    }

    @PostMapping("sendConnectionInvitation")
    public boolean sendConnectionInvitation(@RequestBody ConnectionInvitation invitation){
        return this.memberService.sendConnectionInvitation(invitation);
    }

    @PostMapping("acceptConnection")
    public boolean acceptConnection(@RequestBody ConnectionInvitation invitation){
        return this.memberService.acceptConnection(invitation);
    }

    @PostMapping("rejectConnection")
    public boolean rejectConnection(@RequestBody ConnectionInvitation invitation){
        return this.memberService.rejectConnection(invitation);
    }

    @PostMapping("profile/addWorkExperience")
    public boolean addWorkExperience(@RequestBody ProfileModel profileModel){
        return this.profileService.addWorkExperience(profileModel);
    }

    @PostMapping("profile/addMember")
    public boolean addMember(@RequestBody Member member){
        return this.groupService.addMember(member);
    }

    @PostMapping("profile/updateDescription")
    public boolean updateDescription(@RequestBody Group group){
        return this.groupService.updateDescription(group);
    }

    @GetMapping("page/getRecommendation")
    public List<Recommendation> getRecommendation(@RequestBody Page page){
        return this.pageService.getRecommendation(page);
    }

    @GetMapping("search/searchMember")
    public List<Member> searchMember(@RequestBody String name){
        return this.searchService.searchMember(name);
    }

    @GetMapping("search/searchGroup")
    public List<Group> searchGroup(@RequestBody String name){
        return this.searchService.searchGroup(name);
    }

    @GetMapping("search/searchPage")
    public List<Page> searchPage(@RequestBody String name){
        return this.searchService.searchPage(name);
    }

    @GetMapping("search/searchPost")
    public List<Post> searchPost(@RequestBody String word){
        return this.searchService.searchPost(word);
    }

}
