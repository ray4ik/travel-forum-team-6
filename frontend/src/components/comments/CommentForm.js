import React, { useState } from "react";
import CommentsApi from "../../api/CommentsApi";


export default function CommentForm({
  onSubmit,
  initialBody,
  onCancel,
  formTitle,
  isFormOpen,
  post
}) {
  const [body, setBody] = useState(initialBody || "");

  const onCreateCommentClick = (e) => {
    e.preventDefault();
    const commentData = { body, post:post};
    return CommentsApi.createComment(commentData)
      .then(() => isFormOpen(false));        
  };

  return (
    <div className="comment">
      <div className="card-body">
        <h4 className="card-title">{formTitle || "Create a comment"}</h4>
        <form onSubmit={onCreateCommentClick}>
          <div className="form-group">
            <label>Body:</label>
            <textarea
              className="form-control"
              placeholder="Comment Body"
              value={body}
              onChange={(e) => setBody(e.target.value)}
              required
            />
          </div>

          <div className="form-group">
            <button className="btn btn-info" type="submit">
              Save
            </button>
            <button
              className="btn btn-outline"
              type="button"
              onClick={onCancel}
            >
              Cancel
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}
