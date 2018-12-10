package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mvc.model.Item;
import mvc.model.ItemRepository;

/**
 * 商品サービス
 *
 */
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;

	/**
	 * 全件検索
	 * 
	 * @return
	 */
	public List<Item> findAll() {
		return this.itemRepo.findAll();
	}

	/**
	 * 詳細検索
	 * 
	 * @param itemId
	 *            商品ID
	 * @return
	 */
	public Item find(Long itemId) {
		return this.itemRepo.findById(itemId.longValue()).get();
	}

	/**
	 * 保存処理
	 * 
	 * @param item
	 *            商品
	 * @return
	 */
	@Transactional
	public Item save(Item item) {
		return this.itemRepo.save(item);
	}

	/**
	 * 削除処理
	 * 
	 * @param item
	 *            商品
	 */
	@Transactional
	public void delete(Item item) {
		this.itemRepo.delete(item);
	}
}
