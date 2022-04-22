package com.infotarget.codility.java.refactor.before;

final class ApolloExploreServiceException extends RuntimeException {
  private final HttpStatus httpStatus;

  public ApolloExploreServiceException(String msg, String details, HttpStatus httpStatus) {
    super(msg + ": " + details);
    this.httpStatus = httpStatus;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
