package edu.gdut.juejinserver.service.impl;

import edu.gdut.juejinserver.pojo.Tags;
import edu.gdut.juejinserver.mapper.TagsMapper;
import edu.gdut.juejinserver.service.TagsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags> implements TagsService {

}
