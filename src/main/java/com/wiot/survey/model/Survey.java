package com.wiot.survey.model;

import javax.persistence.*;

public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "companyName")
    private String companyname;

    @Column(name = "companyInfo")
    private String companyinfo;

    @Column(name = "companyLink")
    private String companylink;

    @Column(name = "companyAddress")
    private String companyaddress;

    @Column(name = "createTime")
    private String createtime;

    @Column(name = "linkName")
    private String linkname;

    @Column(name = "likeTelephone")
    private String liketelephone;

    @Column(name = "linkEmail")
    private String linkemail;

    @Column(name = "registerFlag")
    private String registerflag;

    @Column(name = "registerTelephone")
    private String registertelephone;

    @Column(name = "importantBusiness")
    private String importantbusiness;

    @Column(name = "masterBusiness")
    private String masterbusiness;

    @Column(name = "oweIp")
    private String oweip;

    @Column(name = "companyMember")
    private String companymember;

    @Column(name = "techMember")
    private String techmember;

    @Column(name = "techMoney")
    private String techmoney;

    @Column(name = "businessMoney")
    private String businessmoney;

    @Column(name = "companyDemand")
    private String companydemand;

    @Column(name = "remarkInfos")
    private String remarkinfos;

    @Column(name = "fileList")
    private String filelist;

    @Column(name = "locationAddress")
    private String locationaddress;

    @Column(name = "businessName")
    private String businessname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return companyName
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * @param companyname
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    /**
     * @return companyInfo
     */
    public String getCompanyinfo() {
        return companyinfo;
    }

    /**
     * @param companyinfo
     */
    public void setCompanyinfo(String companyinfo) {
        this.companyinfo = companyinfo;
    }

    /**
     * @return companyLink
     */
    public String getCompanylink() {
        return companylink;
    }

    /**
     * @param companylink
     */
    public void setCompanylink(String companylink) {
        this.companylink = companylink;
    }

    /**
     * @return companyAddress
     */
    public String getCompanyaddress() {
        return companyaddress;
    }

    /**
     * @param companyaddress
     */
    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
    }

    /**
     * @return createTime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return linkName
     */
    public String getLinkname() {
        return linkname;
    }

    /**
     * @param linkname
     */
    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    /**
     * @return likeTelephone
     */
    public String getLiketelephone() {
        return liketelephone;
    }

    /**
     * @param liketelephone
     */
    public void setLiketelephone(String liketelephone) {
        this.liketelephone = liketelephone;
    }

    /**
     * @return linkEmail
     */
    public String getLinkemail() {
        return linkemail;
    }

    /**
     * @param linkemail
     */
    public void setLinkemail(String linkemail) {
        this.linkemail = linkemail;
    }

    /**
     * @return registerFlag
     */
    public String getRegisterflag() {
        return registerflag;
    }

    /**
     * @param registerflag
     */
    public void setRegisterflag(String registerflag) {
        this.registerflag = registerflag;
    }

    /**
     * @return registerTelephone
     */
    public String getRegistertelephone() {
        return registertelephone;
    }

    /**
     * @param registertelephone
     */
    public void setRegistertelephone(String registertelephone) {
        this.registertelephone = registertelephone;
    }

    /**
     * @return importantBusiness
     */
    public String getImportantbusiness() {
        return importantbusiness;
    }

    /**
     * @param importantbusiness
     */
    public void setImportantbusiness(String importantbusiness) {
        this.importantbusiness = importantbusiness;
    }

    /**
     * @return masterBusiness
     */
    public String getMasterbusiness() {
        return masterbusiness;
    }

    /**
     * @param masterbusiness
     */
    public void setMasterbusiness(String masterbusiness) {
        this.masterbusiness = masterbusiness;
    }

    /**
     * @return oweIp
     */
    public String getOweip() {
        return oweip;
    }

    /**
     * @param oweip
     */
    public void setOweip(String oweip) {
        this.oweip = oweip;
    }

    /**
     * @return companyMember
     */
    public String getCompanymember() {
        return companymember;
    }

    /**
     * @param companymember
     */
    public void setCompanymember(String companymember) {
        this.companymember = companymember;
    }

    /**
     * @return techMember
     */
    public String getTechmember() {
        return techmember;
    }

    /**
     * @param techmember
     */
    public void setTechmember(String techmember) {
        this.techmember = techmember;
    }

    /**
     * @return techMoney
     */
    public String getTechmoney() {
        return techmoney;
    }

    /**
     * @param techmoney
     */
    public void setTechmoney(String techmoney) {
        this.techmoney = techmoney;
    }

    /**
     * @return businessMoney
     */
    public String getBusinessmoney() {
        return businessmoney;
    }

    /**
     * @param businessmoney
     */
    public void setBusinessmoney(String businessmoney) {
        this.businessmoney = businessmoney;
    }

    /**
     * @return companyDemand
     */
    public String getCompanydemand() {
        return companydemand;
    }

    /**
     * @param companydemand
     */
    public void setCompanydemand(String companydemand) {
        this.companydemand = companydemand;
    }

    /**
     * @return remarkInfos
     */
    public String getRemarkinfos() {
        return remarkinfos;
    }

    /**
     * @param remarkinfos
     */
    public void setRemarkinfos(String remarkinfos) {
        this.remarkinfos = remarkinfos;
    }

    /**
     * @return fileList
     */
    public String getFilelist() {
        return filelist;
    }

    /**
     * @param filelist
     */
    public void setFilelist(String filelist) {
        this.filelist = filelist;
    }

    /**
     * @return locationAddress
     */
    public String getLocationaddress() {
        return locationaddress;
    }

    /**
     * @param locationaddress
     */
    public void setLocationaddress(String locationaddress) {
        this.locationaddress = locationaddress;
    }

    /**
     * @return businessName
     */
    public String getBusinessname() {
        return businessname;
    }

    /**
     * @param businessname
     */
    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }
}