package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mvc.model.Item;
import mvc.model.ItemRepository;

/**
 * ���i�T�[�r�X
 *
 */
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;

	/**
	 * �S������
	 * 
	 * @return
	 */
	public List<Item> findAll() {
		return this.itemRepo.findAll();
	}

	/**
	 * �ڍ׌���
	 * 
	 * @param itemId
	 *            ���iID
	 * @return
	 */
	public Item find(Long itemId) {
		return this.itemRepo.findById(itemId.longValue()).get();
	}

	/**
	 * �ۑ�����
	 * 
	 * @param item
	 *            ���i
	 * @return
	 */
	@Transactional
	public Item save(Item item) {
		return this.itemRepo.save(item);
	}

	/**
	 * �폜����
	 * 
	 * @param item
	 *            ���i
	 */
	@Transactional
	public void delete(Item item) {
		this.itemRepo.delete(item);
	}
}
