<table>
	<caption>table title and/or explanatory text</caption>
	<thead>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Create At</th>
		</tr>
	</thead>
	<tbody>
		<?php foreach ( $danhsach as $key ) {  ?>
		<tr>
			<td td style='width: 150px; border: 1px solid black;'><?php echo $key['name'] ?></td>
			<td td style='width: 150px; border: 1px solid black;'><?php echo $key['email'] ?></td>
			<td td style='width: 150px; border: 1px solid black;'><?php echo $key['created_at'] ?></td>
			<td td style='width: 150px; border: 1px solid black;'><a href="?controller=employee&action=delete&id=<?php echo $key['id'] ?>" title="">Delete</a></td>
		</tr>
		<?php } if( count($danhsach) == 0) {?>
			<td colspan="3">Làm Đéo Gì Giữ Liệu</td>
		<?php }?>
	</tbody>
</table>