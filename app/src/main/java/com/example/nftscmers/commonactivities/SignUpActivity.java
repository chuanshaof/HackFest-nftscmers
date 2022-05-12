package com.example.nftscmers.commonactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.nftscmers.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignUpActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private Button signUp;
    private TextView signIn;

    static final String TAG = "CreateEvents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }
}

//        TextView haveAnAccount = (TextView) findViewById(R.id.alreadyhaveAccount);
//        haveAnAccount.setOnClickListener(this);
//
//        Button registerUser = (Button) findViewById(R.id.button);
//        registerUser.setOnClickListener(this);
//
//        password = (EditText) findViewById(R.id.inputPassword);
//        name = (EditText) findViewById(R.id.inputName);
//        email = (EditText) findViewById(R.id.inputEmail);
//
//        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
//    }
//
//    @SuppressLint("NonConstantResourceId")
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.alreadyhaveAccount:
//                startActivity(new Intent(this, LoginActivity.class));
//                break;
//            case R.id.button:
//                registerUser();
//                break;
//        }
//
//    }
//
//    private void registerUser() {
//        String enteredEmail = email.getText().toString();
//        String enteredPassword = password.getText().toString();
//        String enteredName = name.getText().toString();
//
//        if (enteredPassword.isEmpty()) {
//            password.setError("Password is required");
//            password.requestFocus();
//        } else if (enteredName.isEmpty()) {
//            name.setError("Name is required");
//            name.requestFocus();
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(enteredEmail).matches()) {
//            email.setError("Please provide valid email");
//            email.requestFocus();
//        }
//
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        DocumentReference docIdRef = db.collection("Users").document(enteredName);
//    }
//}

//        FirebaseDocument firebaseDocument = new FirebaseDocument() {
//            @Override
//            public void callbackOnSuccess(DocumentSnapshot document) {
//                if (document.exists()) {
//                    UserModel userModel = document.toObject(UserModel.class);
//                    if (enteredEmail.equals(userModel.getEmail())) {
//                        Toast toast = Toast.makeText(getApplicationContext(),
//                                "Email has been used!",
//                                Toast.LENGTH_SHORT);
//                        toast.show();
//                    }
//                    else {
//                        Toast toast = Toast.makeText(getApplicationContext(),
//                                "Username not available!",
//                                Toast.LENGTH_SHORT);
//                        toast.show();
//                    }
//                }
//                else {
//                    // Add profile to Firestore
//                    ProfileModel emptyProfileModel = new ProfileModel();
//                    setProfileDetails(emptyProfileModel);
//
//                    db.collection("Profiles")
//                            .document(enteredName)
//                            .set(emptyProfileModel)
//                            .addOnSuccessListener(new OnSuccessListener<Void>() {
//                                @Override
//                                public void onSuccess(Void aVoid) {
//                                    Log.d(TAG, "emptyProfileModel: Successful. New empty profile added to Firebase");
//
//                                    DocumentReference profileRef = db.collection("Profiles").document(enteredName);
//                                    FirebaseDocument profileDocument = new FirebaseDocument() {
//                                        @Override
//                                        public void callbackOnSuccess(DocumentSnapshot document) {
//                                            if (document.exists()) {
//                                                Log.d(TAG, "DocumentSnapshot data: " + document.getData());
//
//                                                // Add user to Firestore DB
//                                                UserModel newUserModel = new UserModel(
//                                                        enteredEmail,
//                                                        enteredPassword,
//                                                        profileRef,
//                                                        enteredName
//                                                );
//
//                                                db.collection("Users").document(enteredName).set(newUserModel);
//                                                Log.i(TAG, "userModel: Successful. New user added to Firebase");
//                                                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
//                                            } else {
//                                                Log.w(TAG, "Document does not exist");
//                                            }
//                                        }
//
//                                        @Override
//                                        public void callbackOnFailure(@NonNull Exception e) {
//                                            Log.w(TAG, "Error retrieving document from Firestore", e);
//                                        }
//                                    };
//                                    profileDocument.run(profileRef);
//                                }
//                            })
//                            .addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//                                    Log.w(TAG, "Error writing document", e);
//                                }
//                            });
//                }
//            }
//
//            private void setProfileDetails(ProfileModel emptyProfileModel) {
//                emptyProfileModel.setImagePath("https://lh3.googleusercontent.com/FvbhxldyJyNdgPmJHBs-iYSIAwIzWTnUkk9GCMegaaNgMQJVpFCHzamZP9AcFX8HdaHUy7qLUNAsVBQN_wH_si1WIgdrWzVNrLNz3Q=w600");
//                emptyProfileModel.setUserId(docIdRef);
//                emptyProfileModel.setName(enteredName);
//                emptyProfileModel.setBio("CSD Rocks");
//                emptyProfileModel.setPillar("CSD");
//                emptyProfileModel.setTerm(5);
//            }
//        };
//        firebaseDocument.run(docIdRef);
//    }
