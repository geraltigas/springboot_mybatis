package com.geraltigas.service;

import com.geraltigas.mapper.ScinewsMapper;
import com.geraltigas.pojo.Scinews;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScinewsService {

    private final ScinewsMapper scinewsMapper;

    public ScinewsService(ScinewsMapper scinewsMapper){
        this.scinewsMapper = scinewsMapper;
    }

    public List<Scinews> getAll(){
        return scinewsMapper.getAll();
    }

    public List<Scinews> findByUserId(String userId){
        return scinewsMapper.findByUserId(userId);
    }

    public int updateScinews(Scinews scinews){
        return scinewsMapper.updateScinews(
                scinews.getId(),
                scinews.getTitle(),
                scinews.getType(),
                scinews.getUser_id(),
                scinews.getLink(),
                scinews.getCover(),
                scinews.getDownloads(),
                scinews.getGmt_created(),
                scinews.getCreate_by(),
                scinews.getGmt_updated(),
                scinews.getUpdate_by()
        );
    }

    public int insertScinews(Scinews scinews){
        return scinewsMapper.insertScinews(
                scinews.getId(),
                scinews.getTitle(),
                scinews.getType(),
                scinews.getUser_id(),
                scinews.getLink(),
                scinews.getCover(),
                scinews.getDownloads(),
                scinews.getGmt_created(),
                scinews.getCreate_by(),
                scinews.getGmt_updated(),
                scinews.getUpdate_by()
        );
    }

    public int deleteScinewsByUserId(String userId) {
        return scinewsMapper.deleteScinewsByUserId(
            userId
        );
    }

    public int deleteScinewsByTitle(String title) {
        return scinewsMapper.deleteScinewsByTitle(
                title
        );
    }

}
