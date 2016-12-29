package cn.sunline.rtmarket.service.impl;

import cn.sunline.rtmarket.dao.BussEventDao;
import cn.sunline.rtmarket.entity.RtBussEventEntity;
import cn.sunline.rtmarket.service.BussEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by caiyl on 2016/12/28.
 */
@Service
public class BussEventServiceImpl implements BussEventService {

    @Autowired
    BussEventDao bussEventDao;

    @Override
    public void save(RtBussEventEntity rtBussEventEntity) {
        bussEventDao.save(rtBussEventEntity);
    }

    @Override
    public Page<RtBussEventEntity> findForPage(PageRequest pageRequest) {
        return bussEventDao.findAll(pageRequest);
    }
}
