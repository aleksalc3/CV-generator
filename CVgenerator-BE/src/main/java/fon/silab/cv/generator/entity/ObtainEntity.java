/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.cv.generator.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author aleks
 */
@Entity
@Table(name = "obtain")
public class ObtainEntity implements Serializable {

    @EmbeddedId
    private CvTemplateSectionPK cvTemplateSectionPK;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("cvTemplateId")
    private CvTemplateEntity cvTemplateEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sectionId")
    private SectionEntity sectionEntity;

    @Column(name = "order")
    private Integer order;

    @Column(name = "repeat")
    private boolean repeat;

    public ObtainEntity() {
    }

    public ObtainEntity(CvTemplateSectionPK cvTemplateSectionPK, CvTemplateEntity cvTemplateEntity, SectionEntity sectionEntity, Integer order, boolean repeat) {
        this.cvTemplateSectionPK = new CvTemplateSectionPK(cvTemplateEntity.getId(), sectionEntity.getId() );
        this.cvTemplateEntity = cvTemplateEntity;
        this.sectionEntity = sectionEntity;
        this.order = order;
        this.repeat = repeat;
    }

    public CvTemplateSectionPK getCvTemplateSectionPK() {
        return cvTemplateSectionPK;
    }

    public void setCvTemplateSectionPK(CvTemplateSectionPK cvTemplateSectionPK) {
        this.cvTemplateSectionPK = cvTemplateSectionPK;
    }

    public CvTemplateEntity getCvTemplateEntity() {
        return cvTemplateEntity;
    }

    public void setCvTemplateEntity(CvTemplateEntity cvTemplateEntity) {
        this.cvTemplateEntity = cvTemplateEntity;
    }

    public SectionEntity getSectionEntity() {
        return sectionEntity;
    }

    public void setSectionEntity(SectionEntity sectionEntity) {
        this.sectionEntity = sectionEntity;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cvTemplateEntity);
        hash = 37 * hash + Objects.hashCode(this.sectionEntity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObtainEntity other = (ObtainEntity) obj;
        if (!Objects.equals(this.cvTemplateEntity, other.cvTemplateEntity)) {
            return false;
        }
        if (!Objects.equals(this.sectionEntity, other.sectionEntity)) {
            return false;
        }
        return true;
    }

}
