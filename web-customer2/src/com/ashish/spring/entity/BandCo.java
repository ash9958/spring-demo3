package com.ashish.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="band_co")
public class BandCo {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
	
		@Column(name="band_countery")
		private String countery;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="band_id")
		private BandDetails bandDetails;
		
		public BandCo()
		{
			
		}

		public BandCo(String countery) {
			super();
			this.countery = countery;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCountery() {
			return countery;
		}

		public void setCountery(String countery) {
			this.countery = countery;
		}

		public BandDetails getBandDetails() {
			return bandDetails;
		}

		public void setBandDetails(BandDetails bandDetails) {
			this.bandDetails = bandDetails;
		}

		@Override
		public String toString() {
			return "BandCo [id=" + id + ", countery=" + countery + ", bandDetails=" + bandDetails + "]";
		}
		
}
