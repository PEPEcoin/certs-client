package com.oneops.certs.security.pem;

/**
 * Common PEM format labels.
 *
 * @author Suresh
 */
public enum PemLabel {
  /** PKCS#8 private key */
  PRIVATE_KEY("PRIVATE KEY"),

  /** Encrypted PKCS#8 private key */
  ENCRYPTED_PRIVATE_KEY("ENCRYPTED PRIVATE KEY"),

  /** PKCS#1 RSA private key (Default in Openssl). */
  RSA_PRIVATE_KEY("RSA PRIVATE KEY"),

  /** DSA private key. */
  DSA_PRIVATE_KEY("DSA PRIVATE KEY"),

  /** ECDSA private key. */
  EC_PRIVATE_KEY("EC PRIVATE KEY"),

  /** X.509 public key */
  PUBLIC_KEY("PUBLIC KEY"),

  /** X509v3 certificate */
  CERTIFICATE("CERTIFICATE"),

  /** CSR request. */
  CERT_REQUEST("CERTIFICATE REQUEST");

  private final String label;

  PemLabel(String label) {
    this.label = label;
  }

  /**
   * Returns the PEM header label.
   *
   * @return label string.
   */
  public String labelName() {
    return label;
  }
}
