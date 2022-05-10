package com.example.nftscmers.objectmodels;

import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.DocumentReference;

import java.util.Date;

/*
 * Firebase Firestore Document Object Model for the ApplicationsModel Collection
 * @ID documentId: string
 *
 * @field dateCreated: timestamp
 * @field email: string
 * @field password: string
 * @field profile: DocumentReference from Profiles Collection
 * @field username: string
 */

public class ApplicationsModel implements ObjectModel {
    public static final String TAG = "Applications Model";
    public static final String COLLECTION_ID = "Applications";

    @DocumentId
    private String documentId;

    private Date dateCreated;
    private String email;
    private String password;
    private DocumentReference profile;
    private String username;

    public ApplicationsModel() {
    }

    public ApplicationsModel(String email, String password, DocumentReference profile, String username) {
        this.dateCreated = new Date();
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.username = username;
    }

    public static String getTAG() {
        return TAG;
    }

    public static String getCollectionId() {
        return COLLECTION_ID;
    }

    @Override
    public String getDocumentId() {
        return documentId;
    }

    @Override
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DocumentReference getProfile() {
        return profile;
    }

    public void setProfile(DocumentReference profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "documentId='" + documentId + '\'' +
                ", dateCreated=" + dateCreated +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                ", username='" + username + '\'' +
                '}';
    }
}

