package com.example.nftscmers.objectmodels;

import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.DocumentReference;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class JobModel implements ObjectModel {
    public static final String TAG = "Job Model";
    public static final String COLLECTION_ID = "Jobs";

    @DocumentId
    private String documentId;

    private DocumentReference employer;
    private String position;
    private String description;
    private Date deadline;
    private String location;
    private ArrayList<DocumentReference> accepted;
    private ArrayList<DocumentReference> pending;
    private ArrayList<DocumentReference> skills;
    private ArrayList<DocumentReference> tags;

    private JobModel() {}

    public JobModel(DocumentReference employer) {
        this.employer = employer;
    }

    public JobModel(DocumentReference employer, String position, String description, Date deadline,
                    String location, ArrayList<DocumentReference> skills, ArrayList<DocumentReference> tags,
                    ArrayList<DocumentReference> accepted, ArrayList<DocumentReference> pending) {
        this.employer = employer;
        this.position = position;
        this.description = description;
        this.deadline = deadline;
        this.location = location;
        this.skills = skills;
        this.tags = tags;
        this.accepted = accepted;
        this.pending = pending;
    }

    public static String getCollectionId() {
        return COLLECTION_ID;
    }

    public static String getTAG() {
        return TAG;
    }

    public DocumentReference getEmployer() {
        return employer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<DocumentReference> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<DocumentReference> skills) {
        this.skills = skills;
    }

    public ArrayList<DocumentReference> getTags() {
        return tags;
    }

    public void setTags(ArrayList<DocumentReference> tags) {
        this.tags = tags;
    }

    public ArrayList<DocumentReference> getAccepted() {
        return accepted;
    }

    public void setAccepted(ArrayList<DocumentReference> accepted) {
        this.accepted = accepted;
    }

    public ArrayList<DocumentReference> getPending() {
        return pending;
    }

    public void setPending(ArrayList<DocumentReference> pending) {
        this.pending = pending;
    }

    @Override
    public String getDocumentId() {
        return documentId;
    }

    @Override
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
