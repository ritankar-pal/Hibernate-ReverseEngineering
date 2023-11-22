package in.ineuron.model;
// Generated 22-Nov-2023, 3:02:39 am by Hibernate Tools 4.3.6.Final
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "insurancepolicy", catalog = "pwskill")
public class Insurancepolicy implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer pid;
	private String pname;
	private String ptype;
	private Integer tenure;

	public Insurancepolicy() {
		System.out.println("Insurance Policy Object Instantiation Successful");
	}

	public Insurancepolicy(String pname, String ptype, Integer tenure) {
		this.pname = pname;
		this.ptype = ptype;
		this.tenure = tenure;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pid", unique = true, nullable = false)
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "pname")
	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Column(name = "ptype")
	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	@Column(name = "tenure")
	public Integer getTenure() {
		return this.tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "Insurancepolicy [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", tenure=" + tenure + "]";
	}
	
}
