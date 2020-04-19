package local;

public class AcceptPlaced extends AbstractEvent {

    private Long id;
    private String carno;
    private String carname;
    private String ownername;
    private long repaircnt;
    private String reqcontents;

    public AcceptPlaced(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public long getRepaircnt() {
        return repaircnt;
    }

    public void setRepaircnt(long repaircnt) {
        this.repaircnt = repaircnt;
    }

    public String getReqcontents() {
        return reqcontents;
    }

    public void setReqcontents(String reqcontents) {
        this.reqcontents = reqcontents;
    }
}
