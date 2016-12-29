package cn.sunline.rtmarket.web;

import cn.sunline.rtmarket.entity.RtBussEventEntity;
import cn.sunline.rtmarket.form.PageForm;
import cn.sunline.rtmarket.service.BussEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by caiyl on 2016/12/28.
 */
@Controller
@RequestMapping("/bussEvent")
public class BussEventCtrl extends HttpServlet {
    @Autowired
    private BussEventService bussEventService;

    @RequestMapping(value = "/save")
    public String save(RtBussEventEntity rtBussEventEntity, HttpServletRequest req){
        bussEventService.save(rtBussEventEntity);
        return "redirect:/bussEvent/list.do";
    }

    @RequestMapping(value = "/list")
    public String list(PageForm pageForm, Model model, HttpServletRequest req) {
        PageRequest pageRequest = new PageRequest(pageForm.getPageno(),
                pageForm.getPagesize());
        Page<RtBussEventEntity> page = bussEventService.findForPage(pageRequest);
        model.addAttribute("page", page);
        return "bussEventList";
    }

}
