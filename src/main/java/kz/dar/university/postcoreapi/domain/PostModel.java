package kz.dar.university.postcoreapi.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class PostModel {
    private String postId;
    @NonNull
    private String clientId;
    @NonNull
    private String postRecipientId;
    @NotNull
    private String postItem;
    private String status;
}
