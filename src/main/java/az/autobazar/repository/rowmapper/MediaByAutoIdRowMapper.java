package az.autobazar.repository.rowmapper;


import az.autobazar.domain.Media;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class MediaByAutoIdRowMapper implements RowMapper<Media> {

    @Override
    public Media mapRow(ResultSet resultSet, int i) throws SQLException {

        Media media=new Media();
/*
* "SELECT id as media_id, file_name, mime_type, video, file_length, main FROM media WHERE auto_id IN ("+autoIds.toString().replace("[","")
                .replace("]","")+") ORDER BY main;";
*
* */
        media.setId(resultSet.getLong("media_id"));
        media.setFileName(resultSet.getString("file_name"));
        media.setContentType(resultSet.getString("mime_type"));
        media.setVideo(resultSet.getBoolean("video"));
        media.setLength(resultSet.getLong("file_length"));
        media.setMain(resultSet.getBoolean("main"));

        return media;

    }
}
