package az.autobazar.domain;

import java.time.LocalDateTime;

public class Token extends  AutoBazarBase{
    private String username;
    private long userid;
    private String tokenvalue;
    private LocalDateTime expiredate;
    private String useremail;
    private int userstatus;

    public Token() {
    }

    public Token(String username, long userid, String tokenvalue, LocalDateTime expiredate, String useremail, int userstatus) {
        this.username = username;
        this.userid = userid;
        this.tokenvalue = tokenvalue;
        this.expiredate = expiredate;
        this.useremail = useremail;
        this.userstatus = userstatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getTokenvalue() {
        return tokenvalue;
    }

    public void setTokenvalue(String tokenvalue) {
        this.tokenvalue = tokenvalue;
    }

    public LocalDateTime getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(LocalDateTime expiredate) {
        this.expiredate = expiredate;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public int getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(int userstatus) {
        this.userstatus = userstatus;
    }

    @Override
    public String toString() {
        return "Token{" +
                "username='" + username + '\'' +
                ", userid=" + userid +
                ", tokenvalue='" + tokenvalue + '\'' +
                ", expiredate=" + expiredate +
                ", useremail='" + useremail + '\'' +
                ", userstatus=" + userstatus +
                ", id=" + id +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
