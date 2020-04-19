package local;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="AcceptProcessing_table")
public class AcceptProcessing {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String carno;
    private String carname;
    private String ownername;
    private Long repaircnt;
    private String reqcontents;

    @PostPersist
    public void onPostPersist(){
        AcceptPlaced acceptPlaced = new AcceptPlaced();
        BeanUtils.copyProperties(this, acceptPlaced);
        acceptPlaced.publish();


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

    public Long getRepaircnt() {
        return repaircnt;
    }

    public void setRepaircnt(Long repaircnt) {
        this.repaircnt = repaircnt;
    }

    public String getReqcontents() {
        return reqcontents;
    }

    public void setReqcontents(String reqcontents) {
        this.reqcontents = reqcontents;
    }
}
