package edu.gdut.juejinserver.mapper;

import edu.gdut.juejinserver.pojo.ArticleInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.gdut.juejinserver.vo.ArticleDetailVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Trust会长
 * @since 2022-07-30
 */
@Mapper
public interface ArticleInfoMapper extends BaseMapper<ArticleInfo> {

    ArticleDetailVo queryArticleInfoById(String articleId);

}
