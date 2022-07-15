package eu.kanade.presentation.category.components.repo

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Label
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import eu.kanade.presentation.util.horizontalPadding

@Composable
fun SourceRepoListItem(
    modifier: Modifier,
    repo: String,
    onDelete: (String) -> Unit,
) {
    ElevatedCard(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .padding(start = horizontalPadding, top = horizontalPadding, end = horizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(imageVector = Icons.Outlined.Label, contentDescription = "")
            Text(text = repo, modifier = Modifier.padding(start = horizontalPadding))
        }
        Row {
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { onDelete(repo) }) {
                Icon(imageVector = Icons.Outlined.Delete, contentDescription = "")
            }
        }
    }
}
