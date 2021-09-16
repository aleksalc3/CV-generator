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

/**
 *
 * @author aleks
 */
@Embeddable
public class CvTemplateSectionPK implements Serializable {

    
    @Column(name = "cv_template_id")
    private Long cvTemplateId;
    
    @Column(name = "section_id")
    private Long sectionId;

    public CvTemplateSectionPK() {
    }

    public CvTemplateSectionPK(Long cvTemplateId, Long sectionId) {
        this.cvTemplateId = cvTemplateId;
        this.sectionId = sectionId;
    }

    public Long getCvTemplateId() {
        return cvTemplateId;
    }

    public void setCvTemplateId(Long cvTemplateId) {
        this.cvTemplateId = cvTemplateId;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.cvTemplateId);
        hash = 17 * hash + Objects.hashCode(this.sectionId);
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
        final CvTemplateSectionPK other = (CvTemplateSectionPK) obj;
        if (!Objects.equals(this.cvTemplateId, other.cvTemplateId)) {
            return false;
        }
        if (!Objects.equals(this.sectionId, other.sectionId)) {
            return false;
        }
        return true;
    }

}
