package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaolianpingjiaDao;
import com.entity.JiaolianpingjiaEntity;
import com.service.JiaolianpingjiaService;
import com.entity.vo.JiaolianpingjiaVO;
import com.entity.view.JiaolianpingjiaView;

@Service("jiaolianpingjiaService")
public class JiaolianpingjiaServiceImpl extends ServiceImpl<JiaolianpingjiaDao, JiaolianpingjiaEntity> implements JiaolianpingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaolianpingjiaEntity> page = this.selectPage(
                new Query<JiaolianpingjiaEntity>(params).getPage(),
                new EntityWrapper<JiaolianpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaolianpingjiaEntity> wrapper) {
		  Page<JiaolianpingjiaView> page =new Query<JiaolianpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaolianpingjiaVO> selectListVO(Wrapper<JiaolianpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaolianpingjiaVO selectVO(Wrapper<JiaolianpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaolianpingjiaView> selectListView(Wrapper<JiaolianpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaolianpingjiaView selectView(Wrapper<JiaolianpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
