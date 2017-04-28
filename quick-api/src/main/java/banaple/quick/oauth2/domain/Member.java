package banaple.quick.oauth2.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_member")
public class Member implements Serializable {
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name="name")
    String name;

    public Member() {

    }

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    @Override
    public String toString() {
        String result = "[member_"+id+"] " + name;
        return result;
    }

}
