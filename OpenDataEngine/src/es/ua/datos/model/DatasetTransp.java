package es.ua.datos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="DATASETS_TRANSP")
public class DatasetTransp {
	
	
	@Id @GeneratedValue
	@Column(name = "ID_DATASET_TRANSP")
	private int idDatasetTransp;
	
	@Column(name = "NAME_DATASET_TRANSP")
	private String nameDatasetTransp;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PUBLISHER")
	private String publisher;
	
	@Column(name = "LICENSE")
	private String license;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
		
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="UPDATE_FRECUENCY")
	private String updateFrecuency;
	
	@Column(name="TEMPORAL_COVERAGE")
	private String temporalCoverage;
	
	@Column(name="SCORE")
	private int score;
	
	@Column(name="NUM_VOTES")
	private int numVotes;
	
	//@Formula(" SCORE / NUM_VOTES ")
	@Column(name="ASSESSMENT")
	private float assessment;
	
	@Column(name="VISIBILITY")
	private String visibility;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="ID_DATASET_TRANSP")
	private List<ResourceTransp> resourcesTransp = new ArrayList<ResourceTransp>();
	
	
	public DatasetTransp() {}
	
	public DatasetTransp(int idDatasetTransp,String nameDatasetTransp,String description, String publisher, float assessment,String license,Date creationDate,Date updateDate,String updateFrecuency,String temporalCoverage,int score,int numVotes,String visibility, List<ResourceTransp> resourcesTransp){
	
		super();
		this.idDatasetTransp = idDatasetTransp;		
		
		this.nameDatasetTransp = nameDatasetTransp;
		this.description = description;
		this.publisher = publisher;
		this.assessment = assessment;
		
		this.license = license;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
		this.updateFrecuency = updateFrecuency;
		this.temporalCoverage = temporalCoverage;
		this.score = score;
		this.numVotes = numVotes;
		this.visibility = visibility;
		
		this.resourcesTransp = resourcesTransp;
		
	}
	
	public int getIdDatasetTransp() {
		return idDatasetTransp;
	}

	public void setIdDatasetTransp(int idDatasetTransp) {
		this.idDatasetTransp = idDatasetTransp;
	}

	public String getNameDatasetTransp() {
		return nameDatasetTransp;
	}

	public void setNameDatasetTransp(String nameDatasetTransp) {
		this.nameDatasetTransp = nameDatasetTransp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateFrecuency() {
		return updateFrecuency;
	}

	public void setUpdateFrecuency(String updateFrecuency) {
		this.updateFrecuency = updateFrecuency;
	}

	public String getTemporalCoverage() {
		return temporalCoverage;
	}

	public void setTemporalCoverage(String temporalCoverage) {
		this.temporalCoverage = temporalCoverage;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public float getAssessment() {
		return assessment;
	}

	public void setAssessment(float assessment) {
		this.assessment = assessment;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	public List<ResourceTransp> getResourcesTransp() {
		return resourcesTransp;
	}

	public void setResourcesTransp(List<ResourceTransp> resourcesTransp) {
		this.resourcesTransp = resourcesTransp;
	}

	

}
