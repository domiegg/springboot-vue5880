package com.dao;

import com.entity.JiaolianpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaolianpingjiaVO;
import com.entity.view.JiaolianpingjiaView;


/**
 * 教练评价
 * 
 * @author 
 * @email 
 * @date 2022-04-16 15:51:16
 */
public interface JiaolianpingjiaDao extends BaseMapper<JiaolianpingjiaEntity> {
	
	List<JiaolianpingjiaVO> selectListVO(@Param("ew") Wrapper<JiaolianpingjiaEntity> wrapper);
	
	JiaolianpingjiaVO selectVO(@Param("ew") Wrapper<JiaolianpingjiaEntity> wrapper);
	
	List<JiaolianpingjiaView> selectListView(@Param("ew") Wrapper<JiaolianpingjiaEntity> wrapper);

	List<JiaolianpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaolianpingjiaEntity> wrapper);
	
	JiaolianpingjiaView selectView(@Param("ew") Wrapper<JiaolianpingjiaEntity> wrapper);
	

}
