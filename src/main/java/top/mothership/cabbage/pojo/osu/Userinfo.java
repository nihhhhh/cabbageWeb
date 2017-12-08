package top.mothership.cabbage.pojo.osu;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.time.LocalDate;
@Data
public class Userinfo {
    //不写入数据库
    @SerializedName("username")
    private String userName;
    private int userId;
    private int count300;
    private int count100;
    private int count50;
    @SerializedName("playcount")
    private int playCount;
    private float accuracy;
    private float ppRaw;
    private long rankedScore;
    private long totalScore;
    private float level;
    private int ppRank;
    private int countRankSs;
    private int countRankS;
    private int countRankA;
    private LocalDate queryDate;

}
