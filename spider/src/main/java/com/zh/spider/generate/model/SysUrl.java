package com.zh.spider.generate.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class SysUrl implements Serializable {

    private static final long serialVersionUID = 1536996662182L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String url;

    /**
    * 
    * isNullAble:1
    */
    private String remark;

    /**
    * 
    * isNullAble:1
    */
    private Integer level;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime create;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime update;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setLevel(Integer level){this.level = level;}

    public Integer getLevel(){return this.level;}

    public void setCreate(java.time.LocalDateTime create){this.create = create;}

    public java.time.LocalDateTime getCreate(){return this.create;}

    public void setUpdate(java.time.LocalDateTime update){this.update = update;}

    public java.time.LocalDateTime getUpdate(){return this.update;}
    @Override
    public String toString() {
        return "SysUrl{" +
                "id='" + id + '\'' +
                "url='" + url + '\'' +
                "remark='" + remark + '\'' +
                "level='" + level + '\'' +
                "create='" + create + '\'' +
                "update='" + update + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SysUrl set;

        private ConditionBuilder where;

        public UpdateBuilder set(SysUrl set){
            this.set = set;
            return this;
        }

        public SysUrl getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends SysUrl{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<java.time.LocalDateTime> createList;

        public List<java.time.LocalDateTime> getCreateList(){return this.createList;}

        private java.time.LocalDateTime createSt;

        private java.time.LocalDateTime createEd;

        public java.time.LocalDateTime getCreateSt(){return this.createSt;}

        public java.time.LocalDateTime getCreateEd(){return this.createEd;}

        private List<java.time.LocalDateTime> updateList;

        public List<java.time.LocalDateTime> getUpdateList(){return this.updateList;}

        private java.time.LocalDateTime updateSt;

        private java.time.LocalDateTime updateEd;

        public java.time.LocalDateTime getUpdateSt(){return this.updateSt;}

        public java.time.LocalDateTime getUpdateEd(){return this.updateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }

        public QueryBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public QueryBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public QueryBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public QueryBuilder level(Integer level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public QueryBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
            return this;
        }

        public QueryBuilder createBetWeen(java.time.LocalDateTime createSt,java.time.LocalDateTime createEd){
            this.createSt = createSt;
            this.createEd = createEd;
            return this;
        }

        public QueryBuilder createGreaterEqThan(java.time.LocalDateTime createSt){
            this.createSt = createSt;
            return this;
        }
        public QueryBuilder createLessEqThan(java.time.LocalDateTime createEd){
            this.createEd = createEd;
            return this;
        }


        public QueryBuilder create(java.time.LocalDateTime create){
            setCreate(create);
            return this;
        }

        public QueryBuilder createList(java.time.LocalDateTime ... create){
            this.createList = solveNullList(create);
            return this;
        }

        public QueryBuilder createList(List<java.time.LocalDateTime> create){
            this.createList = create;
            return this;
        }

        public QueryBuilder fetchCreate(){
            setFetchFields("fetchFields","create");
            return this;
        }

        public QueryBuilder excludeCreate(){
            setFetchFields("excludeFields","create");
            return this;
        }

        public QueryBuilder updateBetWeen(java.time.LocalDateTime updateSt,java.time.LocalDateTime updateEd){
            this.updateSt = updateSt;
            this.updateEd = updateEd;
            return this;
        }

        public QueryBuilder updateGreaterEqThan(java.time.LocalDateTime updateSt){
            this.updateSt = updateSt;
            return this;
        }
        public QueryBuilder updateLessEqThan(java.time.LocalDateTime updateEd){
            this.updateEd = updateEd;
            return this;
        }


        public QueryBuilder update(java.time.LocalDateTime update){
            setUpdate(update);
            return this;
        }

        public QueryBuilder updateList(java.time.LocalDateTime ... update){
            this.updateList = solveNullList(update);
            return this;
        }

        public QueryBuilder updateList(List<java.time.LocalDateTime> update){
            this.updateList = update;
            return this;
        }

        public QueryBuilder fetchUpdate(){
            setFetchFields("fetchFields","update");
            return this;
        }

        public QueryBuilder excludeUpdate(){
            setFetchFields("excludeFields","update");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public SysUrl build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<java.time.LocalDateTime> createList;

        public List<java.time.LocalDateTime> getCreateList(){return this.createList;}

        private java.time.LocalDateTime createSt;

        private java.time.LocalDateTime createEd;

        public java.time.LocalDateTime getCreateSt(){return this.createSt;}

        public java.time.LocalDateTime getCreateEd(){return this.createEd;}

        private List<java.time.LocalDateTime> updateList;

        public List<java.time.LocalDateTime> getUpdateList(){return this.updateList;}

        private java.time.LocalDateTime updateSt;

        private java.time.LocalDateTime updateEd;

        public java.time.LocalDateTime getUpdateSt(){return this.updateSt;}

        public java.time.LocalDateTime getUpdateEd(){return this.updateEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public ConditionBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public ConditionBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public ConditionBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public ConditionBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public ConditionBuilder createBetWeen(java.time.LocalDateTime createSt,java.time.LocalDateTime createEd){
            this.createSt = createSt;
            this.createEd = createEd;
            return this;
        }

        public ConditionBuilder createGreaterEqThan(java.time.LocalDateTime createSt){
            this.createSt = createSt;
            return this;
        }
        public ConditionBuilder createLessEqThan(java.time.LocalDateTime createEd){
            this.createEd = createEd;
            return this;
        }


        public ConditionBuilder createList(java.time.LocalDateTime ... create){
            this.createList = solveNullList(create);
            return this;
        }

        public ConditionBuilder createList(List<java.time.LocalDateTime> create){
            this.createList = create;
            return this;
        }

        public ConditionBuilder updateBetWeen(java.time.LocalDateTime updateSt,java.time.LocalDateTime updateEd){
            this.updateSt = updateSt;
            this.updateEd = updateEd;
            return this;
        }

        public ConditionBuilder updateGreaterEqThan(java.time.LocalDateTime updateSt){
            this.updateSt = updateSt;
            return this;
        }
        public ConditionBuilder updateLessEqThan(java.time.LocalDateTime updateEd){
            this.updateEd = updateEd;
            return this;
        }


        public ConditionBuilder updateList(java.time.LocalDateTime ... update){
            this.updateList = solveNullList(update);
            return this;
        }

        public ConditionBuilder updateList(List<java.time.LocalDateTime> update){
            this.updateList = update;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private SysUrl obj;

        public Builder(){
            this.obj = new SysUrl();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder level(Integer level){
            this.obj.setLevel(level);
            return this;
        }
        public Builder create(java.time.LocalDateTime create){
            this.obj.setCreate(create);
            return this;
        }
        public Builder update(java.time.LocalDateTime update){
            this.obj.setUpdate(update);
            return this;
        }
        public SysUrl build(){return obj;}
    }

}
