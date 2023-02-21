package shop.mtcoding.loginexample.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
    public int insert(Board boardRepository);

    public int updateById(Board boardRepository);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

}
