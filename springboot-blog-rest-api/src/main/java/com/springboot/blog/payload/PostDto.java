package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {
    private Long id;
    @Schema(
            description = "Blog Post Title"
    )
//    title should not be null or empty
//    title should have at least 2 characters
    @NotEmpty
    @Size(min=2, message="Post title should have at least 2 characters")
    private String title;

    @Schema(
            description = "Blog Post Description"
    )
//    post description should not be null or empty
//    postDescription should have at least 10 characters
    @NotEmpty
    @Size(min=10, message="Post description should have at least 10 characters")
    private String description;

//   post description should not be null or empty
    @Schema(
            description = "Blog Post Content"
    )
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
    @Schema(
            description = "Blog Post Category"
    )
    private Long categoryId;
}
