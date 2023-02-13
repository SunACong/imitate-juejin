package edu.gdut.juejinserver.mapper;

import edu.gdut.juejinserver.pojo.ArticleInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.gdut.juejinserver.vo.ArticleDetailVo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ArticleInfoMapper extends BaseMapper<ArticleInfo> {

    ArticleDetailVo queryArticleInfoById(String articleId);

}
