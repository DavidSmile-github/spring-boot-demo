package com.david.domain.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(indexName = "appstore_game_vpc", type = "game",shards=3,replicas=1,createIndex = true)
@Data
public class EsGame implements Serializable{

    private static final long serialVersionUID = -2746003341562203334L;
    @Id
    private Long id;

    @Field(type = FieldType.text,analyzer = "ik-pinyin-analyzer",searchAnalyzer = "ik-pinyin-analyzer")
    private String name;

    @Field(type = FieldType.keyword)
    private List<String> keywords;

//    @JSONField(serialize = false)keywords

//    @Field(type = FieldType.text,analyzer = "pinyin_analyzer",searchAnalyzer = "pinyin_analyzer")
//    private String pinyin;

//    @JSONField(serialize = false)
//    @CompletionField(analyzer = "ik_pinyin_analyzer", searchAnalyzer = "ik_pinyin_analyzer")
//    private Completion nameSuggestion;

    @Field(type = FieldType.Integer)
    private Integer runEnv;

    @Field(type = FieldType.Long)
    private Long size;

    @Field(type = FieldType.keyword)
    private String installApkUrl;

    @Field(type = FieldType.keyword)
    private String installPcUrl;

    @Field(type = FieldType.keyword)
    private String instruction;

    @Field(type = FieldType.text,analyzer = "ik_smart",searchAnalyzer = "ik_smart")
    private String introduction;

    @Field(type = FieldType.keyword)
    private String logoUrl;

    @Field(type = FieldType.keyword)
    private String packageUrl;

    @Field(type = FieldType.keyword)
    private String activityName;

    @Field(type = FieldType.Integer)
    private Integer noxIndex;

    @Field(type = FieldType.Integer)
    private Integer baiduIndex;

    @Field(type = FieldType.Integer)
    private Integer factIndex;

    @Field(type = FieldType.Long)
    private Long download;

    @Field(type = FieldType.Long)
    private Long factDownload;

    @Field(type = FieldType.Long)
    private Long noxDownload;

    @Field(type = FieldType.Integer)
    private Integer score;


    @Field(type = FieldType.Long)
    private Long createTime;

    @Field(type = FieldType.Long)
    private Long updateTime;

    @Field(type = FieldType.Long)
    private Long deleteTime;

    @Field(type = FieldType.Integer)
    private Integer status;

    @Field(type = FieldType.Integer)
    private Integer product;

    @Field(type = FieldType.Long)
    private Long uninstallNumber;

    @Field(type = FieldType.Long)
    private Long versionCode;

    @Field(type = FieldType.keyword)
    private String versionName;

    @Field(type = FieldType.keyword)
    private String sentence;

    @Field(type = FieldType.Long)
    private Long installNumer;

    @Field(type = FieldType.keyword)
    private String label;

    @Field(type = FieldType.Integer)
    private Integer source;

    @Field(type = FieldType.Integer)
    private Integer payment;

    @Field(type = FieldType.Integer)
    private Integer lang;

    @Field(type = FieldType.Integer)
    private Long gameSubmitId;

    @Field(type = FieldType.Integer)
    private Integer appType;

    @Field(type = FieldType.Integer)
    private Integer channelNum;

    @Field(type = FieldType.Integer)
    private Integer havingGift;

    @Field(type = FieldType.Integer)
    private Integer releaseStatus;

    @Field(type = FieldType.Long)
    private Long releaseSTime;

    @Field(type = FieldType.Long)
    private Long releaseETime;

    @Field(type = FieldType.keyword)
    private String bannerImage;

    @Field(type = FieldType.keyword)
    private String welfareText;

    @Field(type = FieldType.keyword)
    private String videoUrl;

    @Field(type = FieldType.Long)
    private Long reservesNumber;

    @Field(type = FieldType.Long)
    private long collectionNum;

    @Field(type = FieldType.keyword)
    private String policeRecordNumber;

    @Field(type = FieldType.keyword)
    private String landingPage;

    @Field(type = FieldType.keyword)
    private String langName;

    @Field(type = FieldType.keyword)
    private String paymentName;

    @Field(type = FieldType.keyword)
    private String channelName;

    @Field(type = FieldType.keyword)
    private String urlQrCode;

    @Field(type = FieldType.Integer)
    private Integer advertisementSource;

    @Field(type = FieldType.Integer)
    private Integer advertisementTop;

    @Field(type = FieldType.Integer)
    private Integer reservesStatus;

    @Field(type = FieldType.keyword)
    private String detailUrl;

    @Field(type = FieldType.keyword)
    private String playUrl;

    @Field(type = FieldType.keyword)
    private Integer advertisementPackage;

    @Field(type = FieldType.keyword)
    private String advertisementPackageDetail="";

    private Object labelObj;

    private Object channelObj;

    private Object permissionsObj;

    private Integer collectionId=0;

    private Long orderNum=0l;

    @Field(type = FieldType.keyword)
    private List<String> labelList;

    @Field(type = FieldType.keyword)
    private List<String> permissionList;

    @Field(type = FieldType.Nested)
    private List<EsGameImage> imageList;

    @Field(type = FieldType.Nested)
    private List<EsTag> tagList = new ArrayList<EsTag>();

    @Field(type = FieldType.Nested)
    private List<EsTopic> topicList = new ArrayList<EsTopic>();

    @Field(type = FieldType.Nested)
    private List<EsDiscover> discoverList = new ArrayList<EsDiscover>();

    @Field(type = FieldType.Nested)
    private List<EsRankingGame> rankingGames = new ArrayList<EsRankingGame>();


    @Field(type = FieldType.Nested)
    private List<EsAdvertisementsGame> advertisementsGameList;

    @Field(type = FieldType.keyword)
    private String recommendInfo;

    @Field(type = FieldType.keyword)
    private String recommendImage;

    @Field(type = FieldType.keyword)
    private String videoCover;

    @Field(type = FieldType.keyword)
    private String recommendVideoUrl;

    @Field(type = FieldType.Integer)
    private Integer hasRecommendVideo;


}
